package tbclient.ForumGuide;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class HotSearch extends Message {
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_SEARCH_TITLE = "";
    public static final String DEFAULT_SLOGAN = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String search_title;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String slogan;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<HotSearch> {
        public Long forum_id;
        public String forum_name;
        public String search_title;
        public String slogan;

        public Builder() {
        }

        public Builder(HotSearch hotSearch) {
            super(hotSearch);
            if (hotSearch == null) {
                return;
            }
            this.forum_id = hotSearch.forum_id;
            this.forum_name = hotSearch.forum_name;
            this.slogan = hotSearch.slogan;
            this.search_title = hotSearch.search_title;
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
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            String str2 = builder.slogan;
            if (str2 == null) {
                this.slogan = "";
            } else {
                this.slogan = str2;
            }
            String str3 = builder.search_title;
            if (str3 == null) {
                this.search_title = "";
                return;
            } else {
                this.search_title = str3;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.slogan = builder.slogan;
        this.search_title = builder.search_title;
    }
}
