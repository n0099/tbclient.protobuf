package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.LayoutFactory;
/* loaded from: classes2.dex */
public final class PageData extends Message {
    @ProtoField(tag = 1)
    public final LayoutFactory feed;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PageData> {
        public LayoutFactory feed;

        public Builder() {
        }

        public Builder(PageData pageData) {
            super(pageData);
            if (pageData == null) {
                return;
            }
            this.feed = pageData.feed;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PageData build(boolean z) {
            return new PageData(this, z);
        }
    }

    public PageData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.feed = builder.feed;
        } else {
            this.feed = builder.feed;
        }
    }
}
