package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class FeedHeadComponent extends Message {
    public static final String DEFAULT_SCHEMA = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedHeadSymbol> extra_data;
    @ProtoField(tag = 1)
    public final FeedHeadImg image_data;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedHeadSymbol> main_data;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String schema;
    public static final List<FeedHeadSymbol> DEFAULT_MAIN_DATA = Collections.emptyList();
    public static final List<FeedHeadSymbol> DEFAULT_EXTRA_DATA = Collections.emptyList();

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FeedHeadComponent> {
        public List<FeedHeadSymbol> extra_data;
        public FeedHeadImg image_data;
        public List<FeedHeadSymbol> main_data;
        public String schema;

        public Builder() {
        }

        public Builder(FeedHeadComponent feedHeadComponent) {
            super(feedHeadComponent);
            if (feedHeadComponent == null) {
                return;
            }
            this.image_data = feedHeadComponent.image_data;
            this.main_data = Message.copyOf(feedHeadComponent.main_data);
            this.extra_data = Message.copyOf(feedHeadComponent.extra_data);
            this.schema = feedHeadComponent.schema;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedHeadComponent build(boolean z) {
            return new FeedHeadComponent(this, z);
        }
    }

    public FeedHeadComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.image_data = builder.image_data;
            List<FeedHeadSymbol> list = builder.main_data;
            if (list == null) {
                this.main_data = DEFAULT_MAIN_DATA;
            } else {
                this.main_data = Message.immutableCopyOf(list);
            }
            List<FeedHeadSymbol> list2 = builder.extra_data;
            if (list2 == null) {
                this.extra_data = DEFAULT_EXTRA_DATA;
            } else {
                this.extra_data = Message.immutableCopyOf(list2);
            }
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str;
                return;
            }
        }
        this.image_data = builder.image_data;
        this.main_data = Message.immutableCopyOf(builder.main_data);
        this.extra_data = Message.immutableCopyOf(builder.extra_data);
        this.schema = builder.schema;
    }
}
