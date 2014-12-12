package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.RecommendForumInfo;
import tbclient.SimpleThreadInfo;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final List<SimpleThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    @ProtoField(tag = 1)
    public final RecommendForumInfo forum_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<SimpleThreadInfo> thread_list;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.forum_info = builder.forum_info;
            if (builder.thread_list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
                return;
            } else {
                this.thread_list = immutableCopyOf(builder.thread_list);
                return;
            }
        }
        this.forum_info = builder.forum_info;
        this.thread_list = immutableCopyOf(builder.thread_list);
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public RecommendForumInfo forum_info;
        public List<SimpleThreadInfo> thread_list;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.forum_info = dataRes.forum_info;
                this.thread_list = DataRes.copyOf(dataRes.thread_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
