package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class FeedExtInfo extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> feed_bar;
    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
    public final List<String> feed_tab;
    public static final List<String> DEFAULT_FEED_TAB = Collections.emptyList();
    public static final List<String> DEFAULT_FEED_BAR = Collections.emptyList();

    private FeedExtInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.feed_tab == null) {
                this.feed_tab = DEFAULT_FEED_TAB;
            } else {
                this.feed_tab = immutableCopyOf(builder.feed_tab);
            }
            if (builder.feed_bar == null) {
                this.feed_bar = DEFAULT_FEED_BAR;
                return;
            } else {
                this.feed_bar = immutableCopyOf(builder.feed_bar);
                return;
            }
        }
        this.feed_tab = immutableCopyOf(builder.feed_tab);
        this.feed_bar = immutableCopyOf(builder.feed_bar);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<FeedExtInfo> {
        public List<String> feed_bar;
        public List<String> feed_tab;

        public Builder() {
        }

        public Builder(FeedExtInfo feedExtInfo) {
            super(feedExtInfo);
            if (feedExtInfo != null) {
                this.feed_tab = FeedExtInfo.copyOf(feedExtInfo.feed_tab);
                this.feed_bar = FeedExtInfo.copyOf(feedExtInfo.feed_bar);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedExtInfo build(boolean z) {
            return new FeedExtInfo(this, z);
        }
    }
}
