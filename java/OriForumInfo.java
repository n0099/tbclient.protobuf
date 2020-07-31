package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class OriForumInfo extends Message {
    public static final String DEFAULT_ORI_AVATAR = "";
    public static final String DEFAULT_ORI_FNAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ori_avatar;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long ori_fid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String ori_fname;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long ori_member_num;
    public static final Long DEFAULT_ORI_FID = 0L;
    public static final Long DEFAULT_ORI_MEMBER_NUM = 0L;

    private OriForumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.ori_fid == null) {
                this.ori_fid = DEFAULT_ORI_FID;
            } else {
                this.ori_fid = builder.ori_fid;
            }
            if (builder.ori_fname == null) {
                this.ori_fname = "";
            } else {
                this.ori_fname = builder.ori_fname;
            }
            if (builder.ori_avatar == null) {
                this.ori_avatar = "";
            } else {
                this.ori_avatar = builder.ori_avatar;
            }
            if (builder.ori_member_num == null) {
                this.ori_member_num = DEFAULT_ORI_MEMBER_NUM;
                return;
            } else {
                this.ori_member_num = builder.ori_member_num;
                return;
            }
        }
        this.ori_fid = builder.ori_fid;
        this.ori_fname = builder.ori_fname;
        this.ori_avatar = builder.ori_avatar;
        this.ori_member_num = builder.ori_member_num;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<OriForumInfo> {
        public String ori_avatar;
        public Long ori_fid;
        public String ori_fname;
        public Long ori_member_num;

        public Builder() {
        }

        public Builder(OriForumInfo oriForumInfo) {
            super(oriForumInfo);
            if (oriForumInfo != null) {
                this.ori_fid = oriForumInfo.ori_fid;
                this.ori_fname = oriForumInfo.ori_fname;
                this.ori_avatar = oriForumInfo.ori_avatar;
                this.ori_member_num = oriForumInfo.ori_member_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public OriForumInfo build(boolean z) {
            return new OriForumInfo(this, z);
        }
    }
}
