package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class StarContriRecord extends Message {
    public static final String DEFAULT_RECORD_NOTICE = "";
    public static final Long DEFAULT_USER_ID = 0L;
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String record_notice;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;

    private StarContriRecord(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.record_notice == null) {
                this.record_notice = "";
                return;
            } else {
                this.record_notice = builder.record_notice;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.record_notice = builder.record_notice;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<StarContriRecord> {
        public String record_notice;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(StarContriRecord starContriRecord) {
            super(starContriRecord);
            if (starContriRecord != null) {
                this.user_id = starContriRecord.user_id;
                this.user_name = starContriRecord.user_name;
                this.record_notice = starContriRecord.record_notice;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StarContriRecord build(boolean z) {
            return new StarContriRecord(this, z);
        }
    }
}
