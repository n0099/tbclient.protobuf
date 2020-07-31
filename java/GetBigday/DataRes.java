package tbclient.GetBigday;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes16.dex */
public final class DataRes extends Message {
    public static final List<BigdayInfo> DEFAULT_BIGDAY_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<BigdayInfo> bigday_list;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.bigday_list == null) {
                this.bigday_list = DEFAULT_BIGDAY_LIST;
                return;
            } else {
                this.bigday_list = immutableCopyOf(builder.bigday_list);
                return;
            }
        }
        this.bigday_list = immutableCopyOf(builder.bigday_list);
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<BigdayInfo> bigday_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.bigday_list = DataRes.copyOf(dataRes.bigday_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
