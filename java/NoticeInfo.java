package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class NoticeInfo extends Message {
    public static final String DEFAULT_NOTICE = "";
    public static final Integer DEFAULT_PULLCOMMENTFREQUENCE = 0;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String notice;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer pullCommentFrequence;

    private NoticeInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.notice == null) {
                this.notice = "";
            } else {
                this.notice = builder.notice;
            }
            if (builder.pullCommentFrequence == null) {
                this.pullCommentFrequence = DEFAULT_PULLCOMMENTFREQUENCE;
                return;
            } else {
                this.pullCommentFrequence = builder.pullCommentFrequence;
                return;
            }
        }
        this.notice = builder.notice;
        this.pullCommentFrequence = builder.pullCommentFrequence;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<NoticeInfo> {
        public String notice;
        public Integer pullCommentFrequence;

        public Builder() {
        }

        public Builder(NoticeInfo noticeInfo) {
            super(noticeInfo);
            if (noticeInfo != null) {
                this.notice = noticeInfo.notice;
                this.pullCommentFrequence = noticeInfo.pullCommentFrequence;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NoticeInfo build(boolean z) {
            return new NoticeInfo(this, z);
        }
    }
}
