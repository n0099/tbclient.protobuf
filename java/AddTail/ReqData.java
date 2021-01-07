package tbclient.AddTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class ReqData extends Message {
    public static final String DEFAULT_FONTCOLOR = "";
    public static final String DEFAULT_FONTKEYNAME = "";
    public static final String DEFAULT_TAILCONTENT = "";
    @ProtoField(tag = 4)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14710common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String fontColor;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String fontKeyName;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tailContent;

    private ReqData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tailContent == null) {
                this.tailContent = "";
            } else {
                this.tailContent = builder.tailContent;
            }
            if (builder.fontColor == null) {
                this.fontColor = "";
            } else {
                this.fontColor = builder.fontColor;
            }
            if (builder.fontKeyName == null) {
                this.fontKeyName = "";
            } else {
                this.fontKeyName = builder.fontKeyName;
            }
            this.f14710common = builder.f14711common;
            return;
        }
        this.tailContent = builder.tailContent;
        this.fontColor = builder.fontColor;
        this.fontKeyName = builder.fontKeyName;
        this.f14710common = builder.f14711common;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14711common;
        public String fontColor;
        public String fontKeyName;
        public String tailContent;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData != null) {
                this.tailContent = reqData.tailContent;
                this.fontColor = reqData.fontColor;
                this.fontKeyName = reqData.fontKeyName;
                this.f14711common = reqData.f14710common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z);
        }
    }
}
