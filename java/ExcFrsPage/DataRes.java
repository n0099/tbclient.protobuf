package tbclient.ExcFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes6.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer has_more;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ExcellentTagInfo> tag_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ExcellentThreadInfo> thread_list;
    public static final List<ExcellentTagInfo> DEFAULT_TAG_LIST = Collections.emptyList();
    public static final List<ExcellentThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Integer DEFAULT_PN = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tag_list == null) {
                this.tag_list = DEFAULT_TAG_LIST;
            } else {
                this.tag_list = immutableCopyOf(builder.tag_list);
            }
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
                return;
            } else {
                this.pn = builder.pn;
                return;
            }
        }
        this.tag_list = immutableCopyOf(builder.tag_list);
        this.thread_list = immutableCopyOf(builder.thread_list);
        this.has_more = builder.has_more;
        this.pn = builder.pn;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer has_more;
        public Integer pn;
        public List<ExcellentTagInfo> tag_list;
        public List<ExcellentThreadInfo> thread_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.tag_list = DataRes.copyOf(dataRes.tag_list);
                this.thread_list = DataRes.copyOf(dataRes.thread_list);
                this.has_more = dataRes.has_more;
                this.pn = dataRes.pn;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
