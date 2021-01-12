package tbclient.SquareRecommand;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<ThreadInfo> activity_list;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer has_more;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> thread_list;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Integer DEFAULT_PN = 0;
    public static final List<ThreadInfo> DEFAULT_ACTIVITY_LIST = Collections.emptyList();

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.thread_list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = immutableCopyOf(builder.thread_list);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = builder.has_more;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.activity_list == null) {
                this.activity_list = DEFAULT_ACTIVITY_LIST;
                return;
            } else {
                this.activity_list = immutableCopyOf(builder.activity_list);
                return;
            }
        }
        this.thread_list = immutableCopyOf(builder.thread_list);
        this.has_more = builder.has_more;
        this.pn = builder.pn;
        this.activity_list = immutableCopyOf(builder.activity_list);
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ThreadInfo> activity_list;
        public Integer has_more;
        public Integer pn;
        public List<ThreadInfo> thread_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.thread_list = DataRes.copyOf(dataRes.thread_list);
                this.has_more = dataRes.has_more;
                this.pn = dataRes.pn;
                this.activity_list = DataRes.copyOf(dataRes.activity_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
