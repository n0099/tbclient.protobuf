package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
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

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<OriForumInfo> {
        public String ori_avatar;
        public Long ori_fid;
        public String ori_fname;
        public Long ori_member_num;

        public Builder() {
        }

        public Builder(OriForumInfo oriForumInfo) {
            super(oriForumInfo);
            if (oriForumInfo == null) {
                return;
            }
            this.ori_fid = oriForumInfo.ori_fid;
            this.ori_fname = oriForumInfo.ori_fname;
            this.ori_avatar = oriForumInfo.ori_avatar;
            this.ori_member_num = oriForumInfo.ori_member_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public OriForumInfo build(boolean z) {
            return new OriForumInfo(this, z);
        }
    }

    public OriForumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.ori_fid;
            if (l == null) {
                this.ori_fid = DEFAULT_ORI_FID;
            } else {
                this.ori_fid = l;
            }
            String str = builder.ori_fname;
            if (str == null) {
                this.ori_fname = "";
            } else {
                this.ori_fname = str;
            }
            String str2 = builder.ori_avatar;
            if (str2 == null) {
                this.ori_avatar = "";
            } else {
                this.ori_avatar = str2;
            }
            Long l2 = builder.ori_member_num;
            if (l2 == null) {
                this.ori_member_num = DEFAULT_ORI_MEMBER_NUM;
                return;
            } else {
                this.ori_member_num = l2;
                return;
            }
        }
        this.ori_fid = builder.ori_fid;
        this.ori_fname = builder.ori_fname;
        this.ori_avatar = builder.ori_avatar;
        this.ori_member_num = builder.ori_member_num;
    }
}
