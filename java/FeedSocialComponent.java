package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class FeedSocialComponent extends Message {
    @ProtoField(tag = 1)
    public final Agree agree;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer comment_num;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long fid;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<LayoutManageInfo> manage_list;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer share_num;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long tid;
    public static final Integer DEFAULT_COMMENT_NUM = 0;
    public static final Integer DEFAULT_SHARE_NUM = 0;
    public static final Long DEFAULT_TID = 0L;
    public static final Long DEFAULT_FID = 0L;
    public static final List<LayoutManageInfo> DEFAULT_MANAGE_LIST = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FeedSocialComponent> {
        public Agree agree;
        public Integer comment_num;
        public Long fid;
        public List<LayoutManageInfo> manage_list;
        public Integer share_num;
        public Long tid;

        public Builder() {
        }

        public Builder(FeedSocialComponent feedSocialComponent) {
            super(feedSocialComponent);
            if (feedSocialComponent == null) {
                return;
            }
            this.agree = feedSocialComponent.agree;
            this.comment_num = feedSocialComponent.comment_num;
            this.share_num = feedSocialComponent.share_num;
            this.tid = feedSocialComponent.tid;
            this.fid = feedSocialComponent.fid;
            this.manage_list = Message.copyOf(feedSocialComponent.manage_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedSocialComponent build(boolean z) {
            return new FeedSocialComponent(this, z);
        }
    }

    public FeedSocialComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.agree = builder.agree;
            Integer num = builder.comment_num;
            if (num == null) {
                this.comment_num = DEFAULT_COMMENT_NUM;
            } else {
                this.comment_num = num;
            }
            Integer num2 = builder.share_num;
            if (num2 == null) {
                this.share_num = DEFAULT_SHARE_NUM;
            } else {
                this.share_num = num2;
            }
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            Long l2 = builder.fid;
            if (l2 == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l2;
            }
            List<LayoutManageInfo> list = builder.manage_list;
            if (list == null) {
                this.manage_list = DEFAULT_MANAGE_LIST;
                return;
            } else {
                this.manage_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.agree = builder.agree;
        this.comment_num = builder.comment_num;
        this.share_num = builder.share_num;
        this.tid = builder.tid;
        this.fid = builder.fid;
        this.manage_list = Message.immutableCopyOf(builder.manage_list);
    }
}
