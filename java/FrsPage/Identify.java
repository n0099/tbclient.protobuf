package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Identify extends Message {
    public static final String DEFAULT_ID = "";
    public static final Integer DEFAULT_IS_IDENTIFY = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_identify;

    private Identify(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_identify == null) {
                this.is_identify = DEFAULT_IS_IDENTIFY;
            } else {
                this.is_identify = builder.is_identify;
            }
            if (builder.id == null) {
                this.id = "";
                return;
            } else {
                this.id = builder.id;
                return;
            }
        }
        this.is_identify = builder.is_identify;
        this.id = builder.id;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Identify> {
        public String id;
        public Integer is_identify;

        public Builder() {
        }

        public Builder(Identify identify) {
            super(identify);
            if (identify != null) {
                this.is_identify = identify.is_identify;
                this.id = identify.id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Identify build(boolean z) {
            return new Identify(this, z);
        }
    }
}
