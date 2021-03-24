package tbclient.GetDislikeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ForumList;
/* loaded from: classes.dex */
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

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer cur_page;
        public List<ForumList> forum_list;
        public Integer has_more;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.forum_list = Message.copyOf(dataRes.forum_list);
            this.has_more = dataRes.has_more;
            this.cur_page = dataRes.cur_page;
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
            List<ForumList> list = builder.forum_list;
            if (list == null) {
                this.forum_list = DEFAULT_FORUM_LIST;
            } else {
                this.forum_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = num;
            }
            Integer num2 = builder.cur_page;
            if (num2 == null) {
                this.cur_page = DEFAULT_CUR_PAGE;
                return;
            } else {
                this.cur_page = num2;
                return;
            }
        }
        this.forum_list = Message.immutableCopyOf(builder.forum_list);
        this.has_more = builder.has_more;
        this.cur_page = builder.cur_page;
    }
}
