package tbclient.ForumRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class HotSearch extends Message {
    public static final String DEFAULT_SEARCH_TITLE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String search_title;
    @ProtoField(tag = 2)
    public final SearchValue search_value;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<HotSearch> {
        public String search_title;
        public SearchValue search_value;

        public Builder() {
        }

        public Builder(HotSearch hotSearch) {
            super(hotSearch);
            if (hotSearch == null) {
                return;
            }
            this.search_title = hotSearch.search_title;
            this.search_value = hotSearch.search_value;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotSearch build(boolean z) {
            return new HotSearch(this, z);
        }
    }

    public HotSearch(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.search_title;
            if (str == null) {
                this.search_title = "";
            } else {
                this.search_title = str;
            }
            this.search_value = builder.search_value;
            return;
        }
        this.search_title = builder.search_title;
        this.search_value = builder.search_value;
    }
}
