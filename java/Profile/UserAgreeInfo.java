package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class UserAgreeInfo extends Message {
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long ala_agree_num;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer has_user_agree;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long normal_agree_num;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long total_agree_num;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long user_agree_num;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long video_agree_num;
    public static final Long DEFAULT_TOTAL_AGREE_NUM = 0L;
    public static final Long DEFAULT_NORMAL_AGREE_NUM = 0L;
    public static final Long DEFAULT_USER_AGREE_NUM = 0L;
    public static final Long DEFAULT_VIDEO_AGREE_NUM = 0L;
    public static final Long DEFAULT_ALA_AGREE_NUM = 0L;
    public static final Integer DEFAULT_HAS_USER_AGREE = 0;

    private UserAgreeInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.total_agree_num == null) {
                this.total_agree_num = DEFAULT_TOTAL_AGREE_NUM;
            } else {
                this.total_agree_num = builder.total_agree_num;
            }
            if (builder.normal_agree_num == null) {
                this.normal_agree_num = DEFAULT_NORMAL_AGREE_NUM;
            } else {
                this.normal_agree_num = builder.normal_agree_num;
            }
            if (builder.user_agree_num == null) {
                this.user_agree_num = DEFAULT_USER_AGREE_NUM;
            } else {
                this.user_agree_num = builder.user_agree_num;
            }
            if (builder.video_agree_num == null) {
                this.video_agree_num = DEFAULT_VIDEO_AGREE_NUM;
            } else {
                this.video_agree_num = builder.video_agree_num;
            }
            if (builder.ala_agree_num == null) {
                this.ala_agree_num = DEFAULT_ALA_AGREE_NUM;
            } else {
                this.ala_agree_num = builder.ala_agree_num;
            }
            if (builder.has_user_agree == null) {
                this.has_user_agree = DEFAULT_HAS_USER_AGREE;
                return;
            } else {
                this.has_user_agree = builder.has_user_agree;
                return;
            }
        }
        this.total_agree_num = builder.total_agree_num;
        this.normal_agree_num = builder.normal_agree_num;
        this.user_agree_num = builder.user_agree_num;
        this.video_agree_num = builder.video_agree_num;
        this.ala_agree_num = builder.ala_agree_num;
        this.has_user_agree = builder.has_user_agree;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<UserAgreeInfo> {
        public Long ala_agree_num;
        public Integer has_user_agree;
        public Long normal_agree_num;
        public Long total_agree_num;
        public Long user_agree_num;
        public Long video_agree_num;

        public Builder() {
        }

        public Builder(UserAgreeInfo userAgreeInfo) {
            super(userAgreeInfo);
            if (userAgreeInfo != null) {
                this.total_agree_num = userAgreeInfo.total_agree_num;
                this.normal_agree_num = userAgreeInfo.normal_agree_num;
                this.user_agree_num = userAgreeInfo.user_agree_num;
                this.video_agree_num = userAgreeInfo.video_agree_num;
                this.ala_agree_num = userAgreeInfo.ala_agree_num;
                this.has_user_agree = userAgreeInfo.has_user_agree;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserAgreeInfo build(boolean z) {
            return new UserAgreeInfo(this, z);
        }
    }
}
