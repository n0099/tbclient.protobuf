package tbclient.GetAddressList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<listData> address_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<deleteList> deleted_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<robotsList> robots_list;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long timestamp;
    public static final List<listData> DEFAULT_ADDRESS_LIST = Collections.emptyList();
    public static final List<deleteList> DEFAULT_DELETED_LIST = Collections.emptyList();
    public static final Long DEFAULT_TIMESTAMP = 0L;
    public static final List<robotsList> DEFAULT_ROBOTS_LIST = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<listData> address_list;
        public List<deleteList> deleted_list;
        public List<robotsList> robots_list;
        public Long timestamp;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.address_list = Message.copyOf(dataRes.address_list);
            this.deleted_list = Message.copyOf(dataRes.deleted_list);
            this.timestamp = dataRes.timestamp;
            this.robots_list = Message.copyOf(dataRes.robots_list);
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
            List<listData> list = builder.address_list;
            if (list == null) {
                this.address_list = DEFAULT_ADDRESS_LIST;
            } else {
                this.address_list = Message.immutableCopyOf(list);
            }
            List<deleteList> list2 = builder.deleted_list;
            if (list2 == null) {
                this.deleted_list = DEFAULT_DELETED_LIST;
            } else {
                this.deleted_list = Message.immutableCopyOf(list2);
            }
            Long l = builder.timestamp;
            if (l == null) {
                this.timestamp = DEFAULT_TIMESTAMP;
            } else {
                this.timestamp = l;
            }
            List<robotsList> list3 = builder.robots_list;
            if (list3 == null) {
                this.robots_list = DEFAULT_ROBOTS_LIST;
                return;
            } else {
                this.robots_list = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.address_list = Message.immutableCopyOf(builder.address_list);
        this.deleted_list = Message.immutableCopyOf(builder.deleted_list);
        this.timestamp = builder.timestamp;
        this.robots_list = Message.immutableCopyOf(builder.robots_list);
    }
}
