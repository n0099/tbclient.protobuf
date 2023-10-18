package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FeedLayout;
import tbclient.LayoutFactory;
/* loaded from: classes2.dex */
public final class PageData extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<LayoutFactory> feed_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FeedLayout> test_drop;
    public static final List<FeedLayout> DEFAULT_TEST_DROP = Collections.emptyList();
    public static final List<LayoutFactory> DEFAULT_FEED_LIST = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PageData> {
        public List<LayoutFactory> feed_list;
        public List<FeedLayout> test_drop;

        public Builder() {
        }

        public Builder(PageData pageData) {
            super(pageData);
            if (pageData == null) {
                return;
            }
            this.test_drop = Message.copyOf(pageData.test_drop);
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
            List<FeedLayout> list = builder.test_drop;
            if (list == null) {
                this.test_drop = DEFAULT_TEST_DROP;
            } else {
                this.test_drop = Message.immutableCopyOf(list);
            }
            List<LayoutFactory> list2 = builder.feed_list;
            if (list2 == null) {
                this.feed_list = DEFAULT_FEED_LIST;
                return;
            } else {
                this.feed_list = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.test_drop = Message.immutableCopyOf(builder.test_drop);
        this.feed_list = Message.immutableCopyOf(builder.feed_list);
    }
}
