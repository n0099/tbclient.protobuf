package tbclient.ElectionInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class NoticeContent extends Message {
    public static final String DEFAULT_PUBLIC_NOTICE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String public_notice;

    private NoticeContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.public_notice == null) {
                this.public_notice = "";
                return;
            } else {
                this.public_notice = builder.public_notice;
                return;
            }
        }
        this.public_notice = builder.public_notice;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<NoticeContent> {
        public String public_notice;

        public Builder() {
        }

        public Builder(NoticeContent noticeContent) {
            super(noticeContent);
            if (noticeContent != null) {
                this.public_notice = noticeContent.public_notice;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NoticeContent build(boolean z) {
            return new NoticeContent(this, z);
        }
    }
}
