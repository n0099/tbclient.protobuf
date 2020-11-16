package tbclient.AlaTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ForcusRecommand;
import tbclient.ThreadInfo;
/* loaded from: classes21.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 4)
    public final ForcusRecommand forcus_recommand;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer has_more;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> thread_list;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Integer DEFAULT_PN = 0;

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
            this.forcus_recommand = builder.forcus_recommand;
            return;
        }
        this.thread_list = immutableCopyOf(builder.thread_list);
        this.has_more = builder.has_more;
        this.pn = builder.pn;
        this.forcus_recommand = builder.forcus_recommand;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public ForcusRecommand forcus_recommand;
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
                this.forcus_recommand = dataRes.forcus_recommand;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
