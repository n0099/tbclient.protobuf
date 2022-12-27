package tbclient.SubTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static final List<Integer> DEFAULT_ARR_TAG_ID = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.INT32)
    public final List<Integer> arr_tag_id;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1393common;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public List<Integer> arr_tag_id;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1394common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1394common = dataReq.f1393common;
            this.arr_tag_id = Message.copyOf(dataReq.arr_tag_id);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1393common = builder.f1394common;
            List<Integer> list = builder.arr_tag_id;
            if (list == null) {
                this.arr_tag_id = DEFAULT_ARR_TAG_ID;
                return;
            } else {
                this.arr_tag_id = Message.immutableCopyOf(list);
                return;
            }
        }
        this.f1393common = builder.f1394common;
        this.arr_tag_id = Message.immutableCopyOf(builder.arr_tag_id);
    }
}
