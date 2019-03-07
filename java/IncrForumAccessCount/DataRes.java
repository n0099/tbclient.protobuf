package tbclient.IncrForumAccessCount;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.FrequentlyForumInfo;
/* loaded from: classes4.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 1)
    public final FrequentlyForumInfo frequently_forum_info;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.frequently_forum_info = builder.frequently_forum_info;
        } else {
            this.frequently_forum_info = builder.frequently_forum_info;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public FrequentlyForumInfo frequently_forum_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.frequently_forum_info = dataRes.frequently_forum_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
