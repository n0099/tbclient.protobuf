package tbclient.SmartAppList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.SmartApp;
/* loaded from: classes6.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.BOOL)
    public final Boolean has_more;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<SmartApp> smart_app_list;
    public static final List<SmartApp> DEFAULT_SMART_APP_LIST = Collections.emptyList();
    public static final Boolean DEFAULT_HAS_MORE = false;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.smart_app_list == null) {
                this.smart_app_list = DEFAULT_SMART_APP_LIST;
            } else {
                this.smart_app_list = immutableCopyOf(builder.smart_app_list);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = builder.has_more;
                return;
            }
        }
        this.smart_app_list = immutableCopyOf(builder.smart_app_list);
        this.has_more = builder.has_more;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Boolean has_more;
        public List<SmartApp> smart_app_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.smart_app_list = DataRes.copyOf(dataRes.smart_app_list);
                this.has_more = dataRes.has_more;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
