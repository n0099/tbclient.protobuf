package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class SortOption extends Message {
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_SORT_TYPE = 0;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer sort_type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SortOption> {
        public String name;
        public Integer sort_type;

        public Builder() {
        }

        public Builder(SortOption sortOption) {
            super(sortOption);
            if (sortOption == null) {
                return;
            }
            this.name = sortOption.name;
            this.sort_type = sortOption.sort_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SortOption build(boolean z) {
            return new SortOption(this, z);
        }
    }

    public SortOption(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            Integer num = builder.sort_type;
            if (num == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
                return;
            } else {
                this.sort_type = num;
                return;
            }
        }
        this.name = builder.name;
        this.sort_type = builder.sort_type;
    }
}
