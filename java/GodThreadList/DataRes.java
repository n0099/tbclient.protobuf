package tbclient.GodThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer cur_page;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> thread_list;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer thread_num;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_CUR_PAGE = 0;
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Integer DEFAULT_THREAD_NUM = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.thread_list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = immutableCopyOf(builder.thread_list);
            }
            if (builder.cur_page == null) {
                this.cur_page = DEFAULT_CUR_PAGE;
            } else {
                this.cur_page = builder.cur_page;
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = builder.has_more;
            }
            if (builder.thread_num == null) {
                this.thread_num = DEFAULT_THREAD_NUM;
                return;
            } else {
                this.thread_num = builder.thread_num;
                return;
            }
        }
        this.thread_list = immutableCopyOf(builder.thread_list);
        this.cur_page = builder.cur_page;
        this.has_more = builder.has_more;
        this.thread_num = builder.thread_num;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer cur_page;
        public Integer has_more;
        public List<ThreadInfo> thread_list;
        public Integer thread_num;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.thread_list = DataRes.copyOf(dataRes.thread_list);
                this.cur_page = dataRes.cur_page;
                this.has_more = dataRes.has_more;
                this.thread_num = dataRes.thread_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
