package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class SignUser extends Message {
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer c_sign_num;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer cont_sign_num;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer cout_total_sign_num;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer hun_sign_num;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_org_disabled;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_sign_in;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer miss_sign_num;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer sign_time;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer total_resign_num;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer user_sign_rank;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_IS_SIGN_IN = 0;
    public static final Integer DEFAULT_USER_SIGN_RANK = 0;
    public static final Integer DEFAULT_SIGN_TIME = 0;
    public static final Integer DEFAULT_CONT_SIGN_NUM = 0;
    public static final Integer DEFAULT_COUT_TOTAL_SIGN_NUM = 0;
    public static final Integer DEFAULT_IS_ORG_DISABLED = 0;
    public static final Integer DEFAULT_C_SIGN_NUM = 0;
    public static final Integer DEFAULT_HUN_SIGN_NUM = 0;
    public static final Integer DEFAULT_TOTAL_RESIGN_NUM = 0;
    public static final Integer DEFAULT_MISS_SIGN_NUM = 0;

    private SignUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.is_sign_in == null) {
                this.is_sign_in = DEFAULT_IS_SIGN_IN;
            } else {
                this.is_sign_in = builder.is_sign_in;
            }
            if (builder.user_sign_rank == null) {
                this.user_sign_rank = DEFAULT_USER_SIGN_RANK;
            } else {
                this.user_sign_rank = builder.user_sign_rank;
            }
            if (builder.sign_time == null) {
                this.sign_time = DEFAULT_SIGN_TIME;
            } else {
                this.sign_time = builder.sign_time;
            }
            if (builder.cont_sign_num == null) {
                this.cont_sign_num = DEFAULT_CONT_SIGN_NUM;
            } else {
                this.cont_sign_num = builder.cont_sign_num;
            }
            if (builder.cout_total_sign_num == null) {
                this.cout_total_sign_num = DEFAULT_COUT_TOTAL_SIGN_NUM;
            } else {
                this.cout_total_sign_num = builder.cout_total_sign_num;
            }
            if (builder.is_org_disabled == null) {
                this.is_org_disabled = DEFAULT_IS_ORG_DISABLED;
            } else {
                this.is_org_disabled = builder.is_org_disabled;
            }
            if (builder.c_sign_num == null) {
                this.c_sign_num = DEFAULT_C_SIGN_NUM;
            } else {
                this.c_sign_num = builder.c_sign_num;
            }
            if (builder.hun_sign_num == null) {
                this.hun_sign_num = DEFAULT_HUN_SIGN_NUM;
            } else {
                this.hun_sign_num = builder.hun_sign_num;
            }
            if (builder.total_resign_num == null) {
                this.total_resign_num = DEFAULT_TOTAL_RESIGN_NUM;
            } else {
                this.total_resign_num = builder.total_resign_num;
            }
            if (builder.miss_sign_num == null) {
                this.miss_sign_num = DEFAULT_MISS_SIGN_NUM;
                return;
            } else {
                this.miss_sign_num = builder.miss_sign_num;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.is_sign_in = builder.is_sign_in;
        this.user_sign_rank = builder.user_sign_rank;
        this.sign_time = builder.sign_time;
        this.cont_sign_num = builder.cont_sign_num;
        this.cout_total_sign_num = builder.cout_total_sign_num;
        this.is_org_disabled = builder.is_org_disabled;
        this.c_sign_num = builder.c_sign_num;
        this.hun_sign_num = builder.hun_sign_num;
        this.total_resign_num = builder.total_resign_num;
        this.miss_sign_num = builder.miss_sign_num;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<SignUser> {
        public Integer c_sign_num;
        public Integer cont_sign_num;
        public Integer cout_total_sign_num;
        public Integer hun_sign_num;
        public Integer is_org_disabled;
        public Integer is_sign_in;
        public Integer miss_sign_num;
        public Integer sign_time;
        public Integer total_resign_num;
        public Long user_id;
        public Integer user_sign_rank;

        public Builder() {
        }

        public Builder(SignUser signUser) {
            super(signUser);
            if (signUser != null) {
                this.user_id = signUser.user_id;
                this.is_sign_in = signUser.is_sign_in;
                this.user_sign_rank = signUser.user_sign_rank;
                this.sign_time = signUser.sign_time;
                this.cont_sign_num = signUser.cont_sign_num;
                this.cout_total_sign_num = signUser.cout_total_sign_num;
                this.is_org_disabled = signUser.is_org_disabled;
                this.c_sign_num = signUser.c_sign_num;
                this.hun_sign_num = signUser.hun_sign_num;
                this.total_resign_num = signUser.total_resign_num;
                this.miss_sign_num = signUser.miss_sign_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SignUser build(boolean z) {
            return new SignUser(this, z);
        }
    }
}
