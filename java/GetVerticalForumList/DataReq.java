package tbclient.GetVerticalForumList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;
/* loaded from: classes22.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer begin_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.INT32)
    public final List<Integer> classid_list;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f5040common;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer pn;
    public static final List<Integer> DEFAULT_CLASSID_LIST = Collections.emptyList();
    public static final Integer DEFAULT_BEGIN_ID = 0;
    public static final Integer DEFAULT_PN = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f5040common = builder.f5041common;
            if (builder.classid_list == null) {
                this.classid_list = DEFAULT_CLASSID_LIST;
            } else {
                this.classid_list = immutableCopyOf(builder.classid_list);
            }
            if (builder.begin_id == null) {
                this.begin_id = DEFAULT_BEGIN_ID;
            } else {
                this.begin_id = builder.begin_id;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
                return;
            } else {
                this.pn = builder.pn;
                return;
            }
        }
        this.f5040common = builder.f5041common;
        this.classid_list = immutableCopyOf(builder.classid_list);
        this.begin_id = builder.begin_id;
        this.pn = builder.pn;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer begin_id;
        public List<Integer> classid_list;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f5041common;
        public Integer pn;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f5041common = dataReq.f5040common;
                this.classid_list = DataReq.copyOf(dataReq.classid_list);
                this.begin_id = dataReq.begin_id;
                this.pn = dataReq.pn;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
