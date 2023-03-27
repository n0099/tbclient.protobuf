package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class FeedHeadSymbol extends Message {
    public static final String DEFAULT_SCHEMA = "";
    public static final Integer DEFAULT_TYPE = 0;
    @ProtoField(tag = 1)
    public final FeedHeadIcon icon;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 3)
    public final FeedHeadText text;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FeedHeadSymbol> {
        public FeedHeadIcon icon;
        public String schema;
        public FeedHeadText text;
        public Integer type;

        public Builder() {
        }

        public Builder(FeedHeadSymbol feedHeadSymbol) {
            super(feedHeadSymbol);
            if (feedHeadSymbol == null) {
                return;
            }
            this.icon = feedHeadSymbol.icon;
            this.type = feedHeadSymbol.type;
            this.text = feedHeadSymbol.text;
            this.schema = feedHeadSymbol.schema;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedHeadSymbol build(boolean z) {
            return new FeedHeadSymbol(this, z);
        }
    }

    public FeedHeadSymbol(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.icon = builder.icon;
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            this.text = builder.text;
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str;
                return;
            }
        }
        this.icon = builder.icon;
        this.type = builder.type;
        this.text = builder.text;
        this.schema = builder.schema;
    }
}
