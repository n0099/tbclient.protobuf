package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class FeedExtInfo extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> feed_bar;
    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
    public final List<String> feed_tab;
    public static final List<String> DEFAULT_FEED_TAB = Collections.emptyList();
    public static final List<String> DEFAULT_FEED_BAR = Collections.emptyList();

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<FeedExtInfo> {
        public List<String> feed_bar;
        public List<String> feed_tab;

        public Builder() {
        }

        public Builder(FeedExtInfo feedExtInfo) {
            super(feedExtInfo);
            if (feedExtInfo == null) {
                return;
            }
            this.feed_tab = Message.copyOf(feedExtInfo.feed_tab);
            this.feed_bar = Message.copyOf(feedExtInfo.feed_bar);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedExtInfo build(boolean z) {
            return new FeedExtInfo(this, z);
        }
    }

    public FeedExtInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<String> list = builder.feed_tab;
            if (list == null) {
                this.feed_tab = DEFAULT_FEED_TAB;
            } else {
                this.feed_tab = Message.immutableCopyOf(list);
            }
            List<String> list2 = builder.feed_bar;
            if (list2 == null) {
                this.feed_bar = DEFAULT_FEED_BAR;
                return;
            } else {
                this.feed_bar = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.feed_tab = Message.immutableCopyOf(builder.feed_tab);
        this.feed_bar = Message.immutableCopyOf(builder.feed_bar);
    }
}
