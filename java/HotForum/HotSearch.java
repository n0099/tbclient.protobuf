package tbclient.HotForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class HotSearch extends Message {
    public static final Integer DEFAULT_JUMP_TYPE = 0;
    public static final String DEFAULT_SEARCH_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer jump_type;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String search_title;
    @ProtoField(tag = 2)
    public final SearchValue search_value;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<HotSearch> {
        public Integer jump_type;
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
            this.jump_type = hotSearch.jump_type;
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
            Integer num = builder.jump_type;
            if (num == null) {
                this.jump_type = DEFAULT_JUMP_TYPE;
                return;
            } else {
                this.jump_type = num;
                return;
            }
        }
        this.search_title = builder.search_title;
        this.search_value = builder.search_value;
        this.jump_type = builder.jump_type;
    }
}
