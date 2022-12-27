package tbclient.GetMsgRecForumlist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Page;
import tbclient.RecommendForumInfo;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static final List<RecommendForumInfo> DEFAULT_FORUM_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<RecommendForumInfo> forum_list;
    @ProtoField(tag = 2)
    public final Page page_info;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<RecommendForumInfo> forum_list;
        public Page page_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.forum_list = Message.copyOf(dataRes.forum_list);
            this.page_info = dataRes.page_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<RecommendForumInfo> list = builder.forum_list;
            if (list == null) {
                this.forum_list = DEFAULT_FORUM_LIST;
            } else {
                this.forum_list = Message.immutableCopyOf(list);
            }
            this.page_info = builder.page_info;
            return;
        }
        this.forum_list = Message.immutableCopyOf(builder.forum_list);
        this.page_info = builder.page_info;
    }
}
