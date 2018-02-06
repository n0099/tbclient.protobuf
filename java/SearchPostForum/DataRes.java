package tbclient.SearchPostForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class DataRes extends Message {
    public static final List<SearchForum> DEFAULT_FUZZY_MATCH = Collections.emptyList();
    @ProtoField(tag = 1)
    public final SearchForum exact_match;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<SearchForum> fuzzy_match;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.exact_match = builder.exact_match;
            if (builder.fuzzy_match == null) {
                this.fuzzy_match = DEFAULT_FUZZY_MATCH;
                return;
            } else {
                this.fuzzy_match = immutableCopyOf(builder.fuzzy_match);
                return;
            }
        }
        this.exact_match = builder.exact_match;
        this.fuzzy_match = immutableCopyOf(builder.fuzzy_match);
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public SearchForum exact_match;
        public List<SearchForum> fuzzy_match;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.exact_match = dataRes.exact_match;
                this.fuzzy_match = DataRes.copyOf(dataRes.fuzzy_match);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
