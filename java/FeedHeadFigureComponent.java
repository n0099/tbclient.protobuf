package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class FeedHeadFigureComponent extends Message {
    public static final String DEFAULT_SCHEMA = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<FeedKV> business_info;
    @ProtoField(tag = 5)
    public final CustomState custom_state;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedHeadSymbol> extra_data;
    @ProtoField(tag = 1)
    public final FeedHeadFigure image_data;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedHeadSymbol> main_data;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String schema;
    public static final List<FeedHeadSymbol> DEFAULT_MAIN_DATA = Collections.emptyList();
    public static final List<FeedHeadSymbol> DEFAULT_EXTRA_DATA = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FeedHeadFigureComponent> {
        public List<FeedKV> business_info;
        public CustomState custom_state;
        public List<FeedHeadSymbol> extra_data;
        public FeedHeadFigure image_data;
        public List<FeedHeadSymbol> main_data;
        public String schema;

        public Builder() {
        }

        public Builder(FeedHeadFigureComponent feedHeadFigureComponent) {
            super(feedHeadFigureComponent);
            if (feedHeadFigureComponent == null) {
                return;
            }
            this.image_data = feedHeadFigureComponent.image_data;
            this.main_data = Message.copyOf(feedHeadFigureComponent.main_data);
            this.extra_data = Message.copyOf(feedHeadFigureComponent.extra_data);
            this.schema = feedHeadFigureComponent.schema;
            this.custom_state = feedHeadFigureComponent.custom_state;
            this.business_info = Message.copyOf(feedHeadFigureComponent.business_info);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedHeadFigureComponent build(boolean z) {
            return new FeedHeadFigureComponent(this, z);
        }
    }

    public FeedHeadFigureComponent(Builder builder, boolean z) {
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
            } else {
                this.schema = str;
            }
            this.custom_state = builder.custom_state;
            List<FeedKV> list3 = builder.business_info;
            if (list3 == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
                return;
            } else {
                this.business_info = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.image_data = builder.image_data;
        this.main_data = Message.immutableCopyOf(builder.main_data);
        this.extra_data = Message.immutableCopyOf(builder.extra_data);
        this.schema = builder.schema;
        this.custom_state = builder.custom_state;
        this.business_info = Message.immutableCopyOf(builder.business_info);
    }
}
