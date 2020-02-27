package tbclient.ActiveConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FloatStrategy;
import tbclient.MissionInfo;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_ACTIVE_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String active_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<FloatStrategy> float_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_new_user;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<MissionInfo> mission_list;
    public static final Integer DEFAULT_IS_NEW_USER = 0;
    public static final List<MissionInfo> DEFAULT_MISSION_LIST = Collections.emptyList();
    public static final List<FloatStrategy> DEFAULT_FLOAT_LIST = Collections.emptyList();

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_new_user == null) {
                this.is_new_user = DEFAULT_IS_NEW_USER;
            } else {
                this.is_new_user = builder.is_new_user;
            }
            if (builder.active_url == null) {
                this.active_url = "";
            } else {
                this.active_url = builder.active_url;
            }
            if (builder.mission_list == null) {
                this.mission_list = DEFAULT_MISSION_LIST;
            } else {
                this.mission_list = immutableCopyOf(builder.mission_list);
            }
            if (builder.float_list == null) {
                this.float_list = DEFAULT_FLOAT_LIST;
                return;
            } else {
                this.float_list = immutableCopyOf(builder.float_list);
                return;
            }
        }
        this.is_new_user = builder.is_new_user;
        this.active_url = builder.active_url;
        this.mission_list = immutableCopyOf(builder.mission_list);
        this.float_list = immutableCopyOf(builder.float_list);
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String active_url;
        public List<FloatStrategy> float_list;
        public Integer is_new_user;
        public List<MissionInfo> mission_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.is_new_user = dataRes.is_new_user;
                this.active_url = dataRes.active_url;
                this.mission_list = DataRes.copyOf(dataRes.mission_list);
                this.float_list = DataRes.copyOf(dataRes.float_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
