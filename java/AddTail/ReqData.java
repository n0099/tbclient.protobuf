package tbclient.AddTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class ReqData extends Message {
    public static final String DEFAULT_FONTCOLOR = "";
    public static final String DEFAULT_FONTKEYNAME = "";
    public static final String DEFAULT_TAILCONTENT = "";
    @ProtoField(tag = 4)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1241common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String fontColor;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String fontKeyName;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tailContent;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1242common;
        public String fontColor;
        public String fontKeyName;
        public String tailContent;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData == null) {
                return;
            }
            this.tailContent = reqData.tailContent;
            this.fontColor = reqData.fontColor;
            this.fontKeyName = reqData.fontKeyName;
            this.f1242common = reqData.f1241common;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z);
        }
    }

    public ReqData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.tailContent;
            if (str == null) {
                this.tailContent = "";
            } else {
                this.tailContent = str;
            }
            String str2 = builder.fontColor;
            if (str2 == null) {
                this.fontColor = "";
            } else {
                this.fontColor = str2;
            }
            String str3 = builder.fontKeyName;
            if (str3 == null) {
                this.fontKeyName = "";
            } else {
                this.fontKeyName = str3;
            }
            this.f1241common = builder.f1242common;
            return;
        }
        this.tailContent = builder.tailContent;
        this.fontColor = builder.fontColor;
        this.fontKeyName = builder.fontKeyName;
        this.f1241common = builder.f1242common;
    }
}
