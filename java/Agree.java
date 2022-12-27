package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Agree extends Message {
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long agree_num;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer agree_type;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long diff_agree_num;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long disagree_num;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_agree;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer lz_agree;
    public static final Long DEFAULT_AGREE_NUM = 0L;
    public static final Integer DEFAULT_HAS_AGREE = 0;
    public static final Integer DEFAULT_AGREE_TYPE = 0;
    public static final Long DEFAULT_DISAGREE_NUM = 0L;
    public static final Long DEFAULT_DIFF_AGREE_NUM = 0L;
    public static final Integer DEFAULT_LZ_AGREE = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Agree> {
        public Long agree_num;
        public Integer agree_type;
        public Long diff_agree_num;
        public Long disagree_num;
        public Integer has_agree;
        public Integer lz_agree;

        public Builder() {
        }

        public Builder(Agree agree) {
            super(agree);
            if (agree == null) {
                return;
            }
            this.agree_num = agree.agree_num;
            this.has_agree = agree.has_agree;
            this.agree_type = agree.agree_type;
            this.disagree_num = agree.disagree_num;
            this.diff_agree_num = agree.diff_agree_num;
            this.lz_agree = agree.lz_agree;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Agree build(boolean z) {
            return new Agree(this, z);
        }
    }

    public Agree(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.agree_num;
            if (l == null) {
                this.agree_num = DEFAULT_AGREE_NUM;
            } else {
                this.agree_num = l;
            }
            Integer num = builder.has_agree;
            if (num == null) {
                this.has_agree = DEFAULT_HAS_AGREE;
            } else {
                this.has_agree = num;
            }
            Integer num2 = builder.agree_type;
            if (num2 == null) {
                this.agree_type = DEFAULT_AGREE_TYPE;
            } else {
                this.agree_type = num2;
            }
            Long l2 = builder.disagree_num;
            if (l2 == null) {
                this.disagree_num = DEFAULT_DISAGREE_NUM;
            } else {
                this.disagree_num = l2;
            }
            Long l3 = builder.diff_agree_num;
            if (l3 == null) {
                this.diff_agree_num = DEFAULT_DIFF_AGREE_NUM;
            } else {
                this.diff_agree_num = l3;
            }
            Integer num3 = builder.lz_agree;
            if (num3 == null) {
                this.lz_agree = DEFAULT_LZ_AGREE;
                return;
            } else {
                this.lz_agree = num3;
                return;
            }
        }
        this.agree_num = builder.agree_num;
        this.has_agree = builder.has_agree;
        this.agree_type = builder.agree_type;
        this.disagree_num = builder.disagree_num;
        this.diff_agree_num = builder.diff_agree_num;
        this.lz_agree = builder.lz_agree;
    }
}
