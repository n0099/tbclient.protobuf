package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class UserVipInfo extends Message {
    public static final String DEFAULT_ICON_URL = "";
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer a_score;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer e_time;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer ext_score;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer n_score;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer s_time;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer v_level;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer v_status;
    public static final Integer DEFAULT_V_STATUS = 0;
    public static final Integer DEFAULT_S_TIME = 0;
    public static final Integer DEFAULT_E_TIME = 0;
    public static final Integer DEFAULT_EXT_SCORE = 0;
    public static final Integer DEFAULT_V_LEVEL = 0;
    public static final Integer DEFAULT_A_SCORE = 0;
    public static final Integer DEFAULT_N_SCORE = 0;

    private UserVipInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.v_status == null) {
                this.v_status = DEFAULT_V_STATUS;
            } else {
                this.v_status = builder.v_status;
            }
            if (builder.s_time == null) {
                this.s_time = DEFAULT_S_TIME;
            } else {
                this.s_time = builder.s_time;
            }
            if (builder.e_time == null) {
                this.e_time = DEFAULT_E_TIME;
            } else {
                this.e_time = builder.e_time;
            }
            if (builder.ext_score == null) {
                this.ext_score = DEFAULT_EXT_SCORE;
            } else {
                this.ext_score = builder.ext_score;
            }
            if (builder.v_level == null) {
                this.v_level = DEFAULT_V_LEVEL;
            } else {
                this.v_level = builder.v_level;
            }
            if (builder.a_score == null) {
                this.a_score = DEFAULT_A_SCORE;
            } else {
                this.a_score = builder.a_score;
            }
            if (builder.n_score == null) {
                this.n_score = DEFAULT_N_SCORE;
            } else {
                this.n_score = builder.n_score;
            }
            if (builder.icon_url == null) {
                this.icon_url = "";
                return;
            } else {
                this.icon_url = builder.icon_url;
                return;
            }
        }
        this.v_status = builder.v_status;
        this.s_time = builder.s_time;
        this.e_time = builder.e_time;
        this.ext_score = builder.ext_score;
        this.v_level = builder.v_level;
        this.a_score = builder.a_score;
        this.n_score = builder.n_score;
        this.icon_url = builder.icon_url;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<UserVipInfo> {
        public Integer a_score;
        public Integer e_time;
        public Integer ext_score;
        public String icon_url;
        public Integer n_score;
        public Integer s_time;
        public Integer v_level;
        public Integer v_status;

        public Builder() {
        }

        public Builder(UserVipInfo userVipInfo) {
            super(userVipInfo);
            if (userVipInfo != null) {
                this.v_status = userVipInfo.v_status;
                this.s_time = userVipInfo.s_time;
                this.e_time = userVipInfo.e_time;
                this.ext_score = userVipInfo.ext_score;
                this.v_level = userVipInfo.v_level;
                this.a_score = userVipInfo.a_score;
                this.n_score = userVipInfo.n_score;
                this.icon_url = userVipInfo.icon_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserVipInfo build(boolean z) {
            return new UserVipInfo(this, z);
        }
    }
}
