package tbclient.ForumRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class SearchValue extends Message {
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long type;
    public static final Long DEFAULT_TYPE = 0L;
    public static final Long DEFAULT_ID = 0L;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<SearchValue> {
        public String desc;
        public Long id;
        public String name;
        public Long type;

        public Builder() {
        }

        public Builder(SearchValue searchValue) {
            super(searchValue);
            if (searchValue == null) {
                return;
            }
            this.type = searchValue.type;
            this.id = searchValue.id;
            this.name = searchValue.name;
            this.desc = searchValue.desc;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SearchValue build(boolean z) {
            return new SearchValue(this, z);
        }
    }

    public SearchValue(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.type;
            if (l == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = l;
            }
            Long l2 = builder.id;
            if (l2 == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l2;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.desc;
            if (str2 == null) {
                this.desc = "";
                return;
            } else {
                this.desc = str2;
                return;
            }
        }
        this.type = builder.type;
        this.id = builder.id;
        this.name = builder.name;
        this.desc = builder.desc;
    }
}
