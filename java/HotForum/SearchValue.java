package tbclient.HotForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
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

    private SearchValue(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.desc == null) {
                this.desc = "";
                return;
            } else {
                this.desc = builder.desc;
                return;
            }
        }
        this.type = builder.type;
        this.id = builder.id;
        this.name = builder.name;
        this.desc = builder.desc;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<SearchValue> {
        public String desc;
        public Long id;
        public String name;
        public Long type;

        public Builder() {
        }

        public Builder(SearchValue searchValue) {
            super(searchValue);
            if (searchValue != null) {
                this.type = searchValue.type;
                this.id = searchValue.id;
                this.name = searchValue.name;
                this.desc = searchValue.desc;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SearchValue build(boolean z) {
            return new SearchValue(this, z);
        }
    }
}
