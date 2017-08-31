package tbclient.GetRepostRecommendForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.SimpleForum;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_RECOMMEND_EXT = "";
    public static final List<SimpleForum> DEFAULT_RECOMMEND_FORUM_LIST = Collections.emptyList();
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String recommend_ext;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<SimpleForum> recommend_forum_list;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.recommend_forum_list == null) {
                this.recommend_forum_list = DEFAULT_RECOMMEND_FORUM_LIST;
            } else {
                this.recommend_forum_list = immutableCopyOf(builder.recommend_forum_list);
            }
            if (builder.recommend_ext == null) {
                this.recommend_ext = "";
                return;
            } else {
                this.recommend_ext = builder.recommend_ext;
                return;
            }
        }
        this.recommend_forum_list = immutableCopyOf(builder.recommend_forum_list);
        this.recommend_ext = builder.recommend_ext;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String recommend_ext;
        public List<SimpleForum> recommend_forum_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.recommend_forum_list = DataRes.copyOf(dataRes.recommend_forum_list);
                this.recommend_ext = dataRes.recommend_ext;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
