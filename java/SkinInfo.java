package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class SkinInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_MONITOR_ID = "";
    public static final String DEFAULT_OBJ_ID = "";
    public static final String DEFAULT_SKIN = "";
    public static final String DEFAULT_SKIN_SIZE = "";
    public static final String DEFAULT_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String monitor_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String obj_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String skin;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String skin_size;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String monitor_id;
        public String obj_id;
        public String skin;
        public String skin_size;
        public String url;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(SkinInfo skinInfo) {
            super(skinInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {skinInfo};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (skinInfo == null) {
                return;
            }
            this.skin = skinInfo.skin;
            this.skin_size = skinInfo.skin_size;
            this.url = skinInfo.url;
            this.obj_id = skinInfo.obj_id;
            this.monitor_id = skinInfo.monitor_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SkinInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new SkinInfo(this, z, null);
            }
            return (SkinInfo) invokeZ.objValue;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkinInfo(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65536, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65536, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.skin;
            if (str == null) {
                this.skin = "";
            } else {
                this.skin = str;
            }
            String str2 = builder.skin_size;
            if (str2 == null) {
                this.skin_size = "";
            } else {
                this.skin_size = str2;
            }
            String str3 = builder.url;
            if (str3 == null) {
                this.url = "";
            } else {
                this.url = str3;
            }
            String str4 = builder.obj_id;
            if (str4 == null) {
                this.obj_id = "";
            } else {
                this.obj_id = str4;
            }
            String str5 = builder.monitor_id;
            if (str5 == null) {
                this.monitor_id = "";
                return;
            } else {
                this.monitor_id = str5;
                return;
            }
        }
        this.skin = builder.skin;
        this.skin_size = builder.skin_size;
        this.url = builder.url;
        this.obj_id = builder.obj_id;
        this.monitor_id = builder.monitor_id;
    }

    public /* synthetic */ SkinInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
