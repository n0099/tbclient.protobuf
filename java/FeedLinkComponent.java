package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class FeedLinkComponent extends Message {
    public static final List<PbLinkInfo> DEFAULT_LINKS = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<PbLinkInfo> links;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FeedLinkComponent> {
        public List<PbLinkInfo> links;

        public Builder() {
        }

        public Builder(FeedLinkComponent feedLinkComponent) {
            super(feedLinkComponent);
            if (feedLinkComponent == null) {
                return;
            }
            this.links = Message.copyOf(feedLinkComponent.links);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedLinkComponent build(boolean z) {
            return new FeedLinkComponent(this, z);
        }
    }

    public FeedLinkComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<PbLinkInfo> list = builder.links;
            if (list == null) {
                this.links = DEFAULT_LINKS;
                return;
            } else {
                this.links = Message.immutableCopyOf(list);
                return;
            }
        }
        this.links = Message.immutableCopyOf(builder.links);
    }
}
