package tbclient.GetDislikeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ForumList;
/* loaded from: classes7.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer cur_page;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ForumList> forum_list;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_more;
    public static final List<ForumList> DEFAULT_FORUM_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Integer DEFAULT_CUR_PAGE = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_list == null) {
                this.forum_list = DEFAULT_FORUM_LIST;
            } else {
                this.forum_list = immutableCopyOf(builder.forum_list);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = builder.has_more;
            }
            if (builder.cur_page == null) {
                this.cur_page = DEFAULT_CUR_PAGE;
                return;
            } else {
                this.cur_page = builder.cur_page;
                return;
            }
        }
        this.forum_list = immutableCopyOf(builder.forum_list);
        this.has_more = builder.has_more;
        this.cur_page = builder.cur_page;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer cur_page;
        public List<ForumList> forum_list;
        public Integer has_more;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.forum_list = DataRes.copyOf(dataRes.forum_list);
                this.has_more = dataRes.has_more;
                this.cur_page = dataRes.cur_page;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
