package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Agree extends Message {
    public static final Long DEFAULT_AGREE_NUM = 0L;
    public static final Integer DEFAULT_HAS_AGREE = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long agree_num;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_agree;

    /* synthetic */ Agree(Builder builder, boolean z, Agree agree) {
        this(builder, z);
    }

    private Agree(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.agree_num == null) {
                this.agree_num = DEFAULT_AGREE_NUM;
            } else {
                this.agree_num = builder.agree_num;
            }
            if (builder.has_agree == null) {
                this.has_agree = DEFAULT_HAS_AGREE;
                return;
            } else {
                this.has_agree = builder.has_agree;
                return;
            }
        }
        this.agree_num = builder.agree_num;
        this.has_agree = builder.has_agree;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Agree> {
        public Long agree_num;
        public Integer has_agree;

        public Builder() {
        }

        public Builder(Agree agree) {
            super(agree);
            if (agree != null) {
                this.agree_num = agree.agree_num;
                this.has_agree = agree.has_agree;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Agree build(boolean z) {
            return new Agree(this, z, null);
        }
    }
}
