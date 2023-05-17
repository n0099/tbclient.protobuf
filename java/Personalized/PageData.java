package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.LayoutFactory;
/* loaded from: classes10.dex */
public final class PageData extends Message {
    public static final List<LayoutFactory> DEFAULT_FEED_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<LayoutFactory> feed_list;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<PageData> {
        public List<LayoutFactory> feed_list;

        public Builder() {
        }

        public Builder(PageData pageData) {
            super(pageData);
            if (pageData == null) {
                return;
            }
            this.feed_list = Message.copyOf(pageData.feed_list);
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
            List<LayoutFactory> list = builder.feed_list;
            if (list == null) {
                this.feed_list = DEFAULT_FEED_LIST;
                return;
            } else {
                this.feed_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.feed_list = Message.immutableCopyOf(builder.feed_list);
    }
}
