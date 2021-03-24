package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ForcusRecommand extends Message {
    public static final Integer DEFAULT_TYPE = 0;
    public static final List<ForcusUsers> DEFAULT_USERS = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ForcusUsers> users;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ForcusRecommand> {
        public Integer type;
        public List<ForcusUsers> users;

        public Builder() {
        }

        public Builder(ForcusRecommand forcusRecommand) {
            super(forcusRecommand);
            if (forcusRecommand == null) {
                return;
            }
            this.type = forcusRecommand.type;
            this.users = Message.copyOf(forcusRecommand.users);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForcusRecommand build(boolean z) {
            return new ForcusRecommand(this, z);
        }
    }

    public ForcusRecommand(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            List<ForcusUsers> list = builder.users;
            if (list == null) {
                this.users = DEFAULT_USERS;
                return;
            } else {
                this.users = Message.immutableCopyOf(list);
                return;
            }
        }
        this.type = builder.type;
        this.users = Message.immutableCopyOf(builder.users);
    }
}
