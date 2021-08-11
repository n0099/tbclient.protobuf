package tbclient.Lottery;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class DrawInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AWARD_DES = "";
    public static final Long DEFAULT_AWARD_ID;
    public static final String DEFAULT_AWARD_IMGSRC = "";
    public static final String DEFAULT_BSIZE = "";
    public static final Integer DEFAULT_DRAW_RES_TYPE;
    public static final String DEFAULT_LINK = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String award_des;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long award_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String award_imgsrc;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String bsize;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer draw_res_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String link;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DrawInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String award_des;
        public Long award_id;
        public String award_imgsrc;
        public String bsize;
        public Integer draw_res_type;
        public String link;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(DrawInfo drawInfo) {
            super(drawInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {drawInfo};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (drawInfo == null) {
                return;
            }
            this.draw_res_type = drawInfo.draw_res_type;
            this.link = drawInfo.link;
            this.award_imgsrc = drawInfo.award_imgsrc;
            this.bsize = drawInfo.bsize;
            this.award_des = drawInfo.award_des;
            this.award_id = drawInfo.award_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DrawInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DrawInfo(this, z, null) : (DrawInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(993741657, "Ltbclient/Lottery/DrawInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(993741657, "Ltbclient/Lottery/DrawInfo;");
                return;
            }
        }
        DEFAULT_DRAW_RES_TYPE = 0;
        DEFAULT_AWARD_ID = 0L;
    }

    public /* synthetic */ DrawInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawInfo(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Integer num = builder.draw_res_type;
            if (num == null) {
                this.draw_res_type = DEFAULT_DRAW_RES_TYPE;
            } else {
                this.draw_res_type = num;
            }
            String str = builder.link;
            if (str == null) {
                this.link = "";
            } else {
                this.link = str;
            }
            String str2 = builder.award_imgsrc;
            if (str2 == null) {
                this.award_imgsrc = "";
            } else {
                this.award_imgsrc = str2;
            }
            String str3 = builder.bsize;
            if (str3 == null) {
                this.bsize = "";
            } else {
                this.bsize = str3;
            }
            String str4 = builder.award_des;
            if (str4 == null) {
                this.award_des = "";
            } else {
                this.award_des = str4;
            }
            Long l = builder.award_id;
            if (l == null) {
                this.award_id = DEFAULT_AWARD_ID;
                return;
            } else {
                this.award_id = l;
                return;
            }
        }
        this.draw_res_type = builder.draw_res_type;
        this.link = builder.link;
        this.award_imgsrc = builder.award_imgsrc;
        this.bsize = builder.bsize;
        this.award_des = builder.award_des;
        this.award_id = builder.award_id;
    }
}
