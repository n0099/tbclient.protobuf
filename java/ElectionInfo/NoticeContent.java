package tbclient.ElectionInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class NoticeContent extends Message {
    public static final String DEFAULT_PUBLIC_NOTICE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String public_notice;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<NoticeContent> {
        public String public_notice;

        public Builder() {
        }

        public Builder(NoticeContent noticeContent) {
            super(noticeContent);
            if (noticeContent == null) {
                return;
            }
            this.public_notice = noticeContent.public_notice;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NoticeContent build(boolean z) {
            return new NoticeContent(this, z);
        }
    }

    public NoticeContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.public_notice;
            if (str == null) {
                this.public_notice = "";
                return;
            } else {
                this.public_notice = str;
                return;
            }
        }
        this.public_notice = builder.public_notice;
    }
}
