package tbclient.GetUserLives;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaLiveInfo;
/* loaded from: classes9.dex */
public final class MonthLiveList extends Message {
    public static final List<AlaLiveInfo> DEFAULT_MONTH_LIVE_LIST = Collections.emptyList();
    @ProtoField(tag = 1)
    public final DataMonth month_data;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<AlaLiveInfo> month_live_list;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<MonthLiveList> {
        public DataMonth month_data;
        public List<AlaLiveInfo> month_live_list;

        public Builder() {
        }

        public Builder(MonthLiveList monthLiveList) {
            super(monthLiveList);
            if (monthLiveList == null) {
                return;
            }
            this.month_data = monthLiveList.month_data;
            this.month_live_list = Message.copyOf(monthLiveList.month_live_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MonthLiveList build(boolean z) {
            return new MonthLiveList(this, z);
        }
    }

    public MonthLiveList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.month_data = builder.month_data;
            List<AlaLiveInfo> list = builder.month_live_list;
            if (list == null) {
                this.month_live_list = DEFAULT_MONTH_LIVE_LIST;
                return;
            } else {
                this.month_live_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.month_data = builder.month_data;
        this.month_live_list = Message.immutableCopyOf(builder.month_live_list);
    }
}
