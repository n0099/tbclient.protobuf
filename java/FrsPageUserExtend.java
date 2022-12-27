package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class FrsPageUserExtend extends Message {
    public static final String DEFAULT_TIPS = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<User> data;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tips;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer user_extend_storey;
    public static final Integer DEFAULT_USER_EXTEND_STOREY = 0;
    public static final List<User> DEFAULT_DATA = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FrsPageUserExtend> {
        public List<User> data;
        public String tips;
        public Integer user_extend_storey;

        public Builder() {
        }

        public Builder(FrsPageUserExtend frsPageUserExtend) {
            super(frsPageUserExtend);
            if (frsPageUserExtend == null) {
                return;
            }
            this.user_extend_storey = frsPageUserExtend.user_extend_storey;
            this.tips = frsPageUserExtend.tips;
            this.data = Message.copyOf(frsPageUserExtend.data);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrsPageUserExtend build(boolean z) {
            return new FrsPageUserExtend(this, z);
        }
    }

    public FrsPageUserExtend(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.user_extend_storey;
            if (num == null) {
                this.user_extend_storey = DEFAULT_USER_EXTEND_STOREY;
            } else {
                this.user_extend_storey = num;
            }
            String str = builder.tips;
            if (str == null) {
                this.tips = "";
            } else {
                this.tips = str;
            }
            List<User> list = builder.data;
            if (list == null) {
                this.data = DEFAULT_DATA;
                return;
            } else {
                this.data = Message.immutableCopyOf(list);
                return;
            }
        }
        this.user_extend_storey = builder.user_extend_storey;
        this.tips = builder.tips;
        this.data = Message.immutableCopyOf(builder.data);
    }
}
