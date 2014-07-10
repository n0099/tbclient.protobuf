package tbclient.GetAddressList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final List<listData> DEFAULT_ADDRESS_LIST = Collections.emptyList();
    public static final List<deleteList> DEFAULT_DELETED_LIST = Collections.emptyList();
    public static final Long DEFAULT_TIMESTAMP = 0L;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<listData> address_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<deleteList> deleted_list;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long timestamp;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.address_list == null) {
                this.address_list = DEFAULT_ADDRESS_LIST;
            } else {
                this.address_list = immutableCopyOf(builder.address_list);
            }
            if (builder.deleted_list == null) {
                this.deleted_list = DEFAULT_DELETED_LIST;
            } else {
                this.deleted_list = immutableCopyOf(builder.deleted_list);
            }
            if (builder.timestamp == null) {
                this.timestamp = DEFAULT_TIMESTAMP;
                return;
            } else {
                this.timestamp = builder.timestamp;
                return;
            }
        }
        this.address_list = immutableCopyOf(builder.address_list);
        this.deleted_list = immutableCopyOf(builder.deleted_list);
        this.timestamp = builder.timestamp;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public List<listData> address_list;
        public List<deleteList> deleted_list;
        public Long timestamp;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.address_list = DataRes.copyOf(dataRes.address_list);
                this.deleted_list = DataRes.copyOf(dataRes.deleted_list);
                this.timestamp = dataRes.timestamp;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
