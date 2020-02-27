package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PrivateForumInfo;
import tbclient.PrivatePopInfo;
/* loaded from: classes9.dex */
public final class PrivateForumTotalInfo extends Message {
    public static final Integer DEFAULT_PRIVATE_FORUM_TASKPERCENT = 0;
    @ProtoField(tag = 5)
    public final HeadImgs head_imgs;
    @ProtoField(tag = 3)
    public final PrivateForumInfo private_forum_info;
    @ProtoField(tag = 2)
    public final PrivatePopInfo private_forum_popinfo;
    @ProtoField(tag = 1)
    public final PrivateForumShareinfo private_forum_shareinfo;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer private_forum_taskpercent;

    private PrivateForumTotalInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.private_forum_shareinfo = builder.private_forum_shareinfo;
            this.private_forum_popinfo = builder.private_forum_popinfo;
            this.private_forum_info = builder.private_forum_info;
            if (builder.private_forum_taskpercent == null) {
                this.private_forum_taskpercent = DEFAULT_PRIVATE_FORUM_TASKPERCENT;
            } else {
                this.private_forum_taskpercent = builder.private_forum_taskpercent;
            }
            this.head_imgs = builder.head_imgs;
            return;
        }
        this.private_forum_shareinfo = builder.private_forum_shareinfo;
        this.private_forum_popinfo = builder.private_forum_popinfo;
        this.private_forum_info = builder.private_forum_info;
        this.private_forum_taskpercent = builder.private_forum_taskpercent;
        this.head_imgs = builder.head_imgs;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PrivateForumTotalInfo> {
        public HeadImgs head_imgs;
        public PrivateForumInfo private_forum_info;
        public PrivatePopInfo private_forum_popinfo;
        public PrivateForumShareinfo private_forum_shareinfo;
        public Integer private_forum_taskpercent;

        public Builder() {
        }

        public Builder(PrivateForumTotalInfo privateForumTotalInfo) {
            super(privateForumTotalInfo);
            if (privateForumTotalInfo != null) {
                this.private_forum_shareinfo = privateForumTotalInfo.private_forum_shareinfo;
                this.private_forum_popinfo = privateForumTotalInfo.private_forum_popinfo;
                this.private_forum_info = privateForumTotalInfo.private_forum_info;
                this.private_forum_taskpercent = privateForumTotalInfo.private_forum_taskpercent;
                this.head_imgs = privateForumTotalInfo.head_imgs;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PrivateForumTotalInfo build(boolean z) {
            return new PrivateForumTotalInfo(this, z);
        }
    }
}
