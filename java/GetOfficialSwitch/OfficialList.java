package tbclient.GetOfficialSwitch;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes20.dex */
public final class OfficialList extends Message {
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_on;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long uid;
    public static final Long DEFAULT_UID = 0L;
    public static final Integer DEFAULT_IS_ON = 0;

    private OfficialList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.uid == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = builder.uid;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.is_on == null) {
                this.is_on = DEFAULT_IS_ON;
                return;
            } else {
                this.is_on = builder.is_on;
                return;
            }
        }
        this.uid = builder.uid;
        this.name = builder.name;
        this.is_on = builder.is_on;
    }

    /* loaded from: classes20.dex */
    public static final class Builder extends Message.Builder<OfficialList> {
        public Integer is_on;
        public String name;
        public Long uid;

        public Builder() {
        }

        public Builder(OfficialList officialList) {
            super(officialList);
            if (officialList != null) {
                this.uid = officialList.uid;
                this.name = officialList.name;
                this.is_on = officialList.is_on;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public OfficialList build(boolean z) {
            return new OfficialList(this, z);
        }
    }
}
