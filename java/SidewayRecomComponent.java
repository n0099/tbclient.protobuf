package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class SidewayRecomComponent extends Message {
    public static final String DEFAULT_CORNER_URL = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_SCHEMA = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<FeedKV> business_info;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String corner_url;
    @ProtoField(tag = 3)
    public final FeedContentText desc;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 2)
    public final FeedContentText title;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<SidewayRecomComponent> {
        public List<FeedKV> business_info;
        public String corner_url;
        public FeedContentText desc;
        public String img_url;
        public String schema;
        public FeedContentText title;
        public Integer type;

        public Builder() {
        }

        public Builder(SidewayRecomComponent sidewayRecomComponent) {
            super(sidewayRecomComponent);
            if (sidewayRecomComponent == null) {
                return;
            }
            this.type = sidewayRecomComponent.type;
            this.title = sidewayRecomComponent.title;
            this.desc = sidewayRecomComponent.desc;
            this.img_url = sidewayRecomComponent.img_url;
            this.corner_url = sidewayRecomComponent.corner_url;
            this.business_info = Message.copyOf(sidewayRecomComponent.business_info);
            this.schema = sidewayRecomComponent.schema;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SidewayRecomComponent build(boolean z) {
            return new SidewayRecomComponent(this, z);
        }
    }

    public SidewayRecomComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            this.title = builder.title;
            this.desc = builder.desc;
            String str = builder.img_url;
            if (str == null) {
                this.img_url = "";
            } else {
                this.img_url = str;
            }
            String str2 = builder.corner_url;
            if (str2 == null) {
                this.corner_url = "";
            } else {
                this.corner_url = str2;
            }
            List<FeedKV> list = builder.business_info;
            if (list == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
            } else {
                this.business_info = Message.immutableCopyOf(list);
            }
            String str3 = builder.schema;
            if (str3 == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str3;
                return;
            }
        }
        this.type = builder.type;
        this.title = builder.title;
        this.desc = builder.desc;
        this.img_url = builder.img_url;
        this.corner_url = builder.corner_url;
        this.business_info = Message.immutableCopyOf(builder.business_info);
        this.schema = builder.schema;
    }
}
